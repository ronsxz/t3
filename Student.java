public class Student {
   private int studID;
   private String name;
   private int birthDate;
   private int age;
   private String gender;
   private String course;
   private int yearLevel;
   private String email;
   private int contactNumber;
   private String address;
   

   public Student (int studID, String name, int birthDate, int age, String gender, 
           String course, int yearLevel, String email, int contactNumber, String address){
       this.studID = studID;
       this.name = name;
       this.birthDate = birthDate;
       this.age = age;
       this.gender = gender;
       this.course = course;
       this.yearLevel = yearLevel;
       this.email = email;
       this.contactNumber = contactNumber;
       this.address = address;
   }
   public void setStudID(int id){
       this.studID = id;
   }
   public void setName(String name){
       this.name = name;
   }
   public void setBirthDate(int birthDate){
       this.birthDate = birthDate;
   }
   public void setAge(int age){
       this.age = age;
   }
   public void setGender(String gender){
       this.gender = gender;
   }
   public void setCourse(String course){
       this.course = course;
   }
   public void setYearLevel(int yearLevel){
       this.yearLevel = yearLevel;
   }
   public void setEmail(String email){
       this.email = email;
   }
   public void setContactNumber(int contactNumber){
       this.contactNumber = contactNumber;
   }
   public void setAddress(String address){
       this.address = address;
   }
   
   public int getStudID(){
       return this.studID;
   } 
   public String getName() {
       return this.name;
   }
   public int getBirthDate() {
       return this.birthDate;
   }
   public int getAge() {
       return this.age;
   }
   public String getGender() {
       return this.gender;
   }
   public String getCourse() {
       return this.course;
   }
   public int getYearLevel() {
       return this.yearLevel;
   }
   public String getEmail() {
       return this.email;
   }
   public int getContactNumber() {
       return this.contactNumber;
   }
   public String getAddress() {
       return this.address;
   }
}
