public class Person {

  // Fields
  private String firstName;
  private String lastName;
  private String middleName;
  private String birthday;
  private int age = 0;

  // Getters
  public String getFirstName() {
    return firstName;
  }

  public String getMiddleName() {
    return middleName;
  }

  public String getLastName() {
    return lastName;
  }

  public String getFullname() {
    return firstName + " " + lastName;
  }

  public int getAge() {
    return age;
  }

  // Setters
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  // Fullname setter.
  public void setFullname(String fullname) {
    String fixedName = fullname.trim();
    // If there are no spaces in the given name (only first name given).
    if (fixedName.indexOf(" ") < 0) {
      this.firstName = fixedName;
      //   If there is only 1 space in the given name (first name + last name).
    } else if (fixedName.indexOf(" ") == fixedName.lastIndexOf(" ")) {
      this.firstName = fixedName.substring(0, fixedName.indexOf(" "));
      this.lastName =
        fixedName.substring(fixedName.indexOf(" ") + 1, fixedName.length());
      // If there are more than 1 space in the given name (first name + middle name + last name).
    } else {
      this.firstName = fixedName.substring(0, fixedName.indexOf(" "));

      this.middleName =
        fixedName.substring(
          fixedName.indexOf(" ") + 1,
          fixedName.lastIndexOf(" ")
        );

      this.lastName =
        fixedName.substring(fixedName.lastIndexOf(" ") + 1, fixedName.length());
    }
  }

  public void setAge(int age) {
    this.age = age;
  }

  // Get nice little string with information.
  public String toString() {
    if (middleName == null) {
      return (
        "Firstname: " +
        firstName +
        " | Lastname: " +
        lastName +
        " | Age: " +
        age
      );
    } else {
      return (
        "Firstname: " +
        firstName +
        " | Middlename: " +
        middleName +
        " | Lastname: " +
        lastName +
        " | Age: " +
        age
      );
    }
  }

  // Person constructors.
  public Person(
    String firstName,
    String middleName,
    String lastName,
    String birthday,
    int age
  ) {
    this.firstName = firstName;
    this.middleName = middleName;
    this.lastName = lastName;
    this.birthday = birthday;
    this.age = age;
  }

  public Person(String firstName, String middleName, String lastName, int age) {
    this(firstName, middleName, lastName, null, age);
  }

  public Person(String firstName, String lastName, int age) {
    this(firstName, null, lastName, null, age);
  }

  public Person(String firstName, String lastName) {
    this(firstName, null, lastName, null, 0);
  }

  public Person(String fullname, int age) {
    this.setFullname(fullname);
    this.age = age;
  }

  public Person(String fullname) {
    this.setFullname(fullname);
  }

  public Person(Person other) {
    firstName = other.firstName;
    middleName = other.middleName;
    lastName = other.lastName;
    birthday = other.birthday;
    age = other.age;
  }

  public Person() {}
}
