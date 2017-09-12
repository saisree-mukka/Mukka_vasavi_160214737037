import java.util.Date;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
		// Add your implementation here
		return null;
	}

	@Override
	public void setStudents(Student[] students) {
		if(students==NULL){
			throw new IllegalArgumentException();
		}
		else
			this.students=students;
		// Add your implementation here
	}

	@Override
	public Student getStudent(int index) {
		if(index<0 || index>=this.students.length) {
	throw new IllegalArgumentException();
	}
	else {
	return this.students[index];
	}// Add your implementation here
		
	}

	@Override
	public void setStudent(Student student, int index) {
		if(index<0 || index>=this.students.length || student == null) {
        throw new IllegalArgumentException();
        }
        else {
        this.students[index]=student;
        }// Add your implementation here
	}

	@Override
	public void addFirst(Student student) {
		if(student==NULL){
			throw new IllegalArgumentException();
		}
		else{
			Student[] students1=new Student[this.students.length+1];
			students1[0]=student;
			intj=0;
			for(int i=1;i<=this.students.length;i++)
			{
				students1[i]=this.students[j];
				j++;
			}
			this.students=new Student[students1.length];
			this.students=students1;
		}
		// Add your implementation here
	}

	@Override
	public void addLast(Student student) {
		if(student == null) {
        throw new IllegalArgumentException();
        }
        else {
        Student[] students1= new Student[this.students.length+1];
        students1[this.students.length-1]=student;
        students1[this.students.length]=this.students[this.students.length-1];
        students1[this.students.length+1]= this.students[this.students.length];
        this.students = new Student[students1.length];
        this.students = students1;
        }
		// Add your implementation here
	}

	@Override
	public void add(Student student, int index) {
		if(index<0 || index>=this.students.length || student == null) {
        throw new IllegalArgumentException();
        }
        else {
        Student[] students1= new Student[this.students.length+1];
        students1[index]=student;
        for(int i=index;i<this.students.length;i++) {
        students1[i+1]=this.students[i];
        }
        this.students = new Student[students1.length];
        this.students = students1;
        }// Add your implementation here
	}

	@Override
	public void remove(int index) {
		if(index<0 || index>=this.students.length) {
		throw new IllegalArgumentException();
		}
		else {
		Student[] students1= new Student[this.students.length-1];
		students1=this.students;
		for(int i=index;i<this.students.length;i++) {
		students1[i]=this.students[i+1];
		}
		this.students = new Student[students1.length];
		this.students = students1;
		}// Add your implementation here
	}

	@Override
	public void remove(Student student) {
	if(student==null) {
	throw new IllegalArgumentException();
	}
	else {

	for(int i=0;i<this.students.length;i++) {
	if(student==this.students[i]) {
	Student[] students1= new Student[this.students.length-1];
	students1=this.students;
	for(int j=i;j<this.students.length;j++) {
	students1[j]=this.students[j+1];
	}
	this.students = new Student[students1.length];
	this.students = students1;
	break;
	}
	}
	}	// Add your implementation here
	}

	@Override
	public void removeFromIndex(int index) {
		if(index<0 || index>=this.students.length) {
	throw new IllegalArgumentException();
	}	
	else {
	Student[] students1= new Student[index];

	for(int i=0;i<index;i++) {
	students1[i]=this.students[i];
	}
	this.students = new Student[students1.length];
	this.students = students1;
	}// Add your implementation here
	}

	@Override
	public void removeFromElement(Student student) {
		if(student==null) {
	throw new IllegalArgumentException();
	}
	else {

		for(int i=0;i<this.students.length;i++) {
	if(student==this.students[i]) {
	Student[] students1= new Student[i+1];
	for(int j=0;j<i+1;j++) {
	students1[j]=this.students[j];
	}
	this.students = new Student[students1.length];
	this.students = students1;
	break;
	}
	}
	}// Add your implementation here
	}

	@Override
	public void removeToIndex(int index) {
		if(index<0 || index>=this.students.length) {
	throw new IllegalArgumentException();
	}
	else {
	Student[] students1= new Student[this.students.length-index-1];

	for(int i=index;i<this.students.length;i++) {
	students1[i]=this.students[i];
	}
	this.students = new Student[students1.length];
	this.students = students1;
	}// Add your implementation here
	}

	@Override
	public void removeToElement(Student student) {
		if(student==null) {
	throw new IllegalArgumentException();
	}
	else {

	for(int i=0;i<this.students.length;i++) {
	if(student==this.students[i]) {
	Student[] students1= new Student[this.students.length-i-1];

	for(int j=0;j<=i;j++) {
	students1[j]=this.students[j];
	}
	this.students = new Student[students1.length];
	this.students = students1;
	break;
	}
	}
	}// Add your implementation here
	}

	@Override
	public void bubbleSort() {
		Student s1;
	Student[] s = new Student[this.students.length];
	for(int i=0; i < this.students.length-1; i++){
             for(int j=1; j < this.students.length; j++){
                      if(this.students[i].getId() > this.students[j].getId()){
                             //swap elements
                             s1 = this.students[j-1];
                             this.students[j-1] = this.students[j];
                             this.students[j] = s1;
                     }
                      
             }
	}// Add your implementation here
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		if(date==null) {
	throw new IllegalArgumentException();
	}
	else {
	Student[] s=students;
	int j=0;
	for(int i=0;i<this.students.length;i++) {
		if(this.students[i].getBirthDate().equals(date)) {
	s[j]=this.students[i];
	j++;
	}
	}
	Student[] s1 = new Student[j+1];
	s1=s;
	return s1;
	}
	}// Add your implementation here
		
	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		if(firstDate==null || lastDate==null) {
	throw new IllegalArgumentException();
	}
	else {
	Student[] s = students;
	int j=0;
	for(int i=0;i<this.students.length;i++) {
	if((this.students[i].getBirthDate().after(firstDate) && this.students[i].getBirthDate().before(lastDate))||(this.students[i].getBirthDate().equals(firstDate))||(this.students[i].equals(lastDate)) ) {

	s[j]=this.students[i];
	j++;
	}
	}
	Student[] s1 = new Student[j+1];
	s1=s;
	return s1;
	}
	}
// Add your implementation here
		

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		if(date==null) {
	throw new IllegalArgumentException();
	}
	else {
	Student[] s = students;
	int j=0;
	for(int i=0;i<this.students.length;i++) {
	if(date.equals(this.students[i].getBirthDate())|| (Math.abs(date.getDate()-this.students[i].getBirthDate().getDate())<=days)) {
	s[j]=this.students[i];
	j++;

	}
	}
	Student[] s1=new Student[j+1];
	s1=s;
	return s1;
	}// Add your implementation here
		
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		if(indexOfStudent == 0) {
	throw new IllegalArgumentException();
	}
	else {
	int y = this.students[indexOfStudent].getBirthDate().getYear();
	return 2017-y;

	}// Add your implementation here
		
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		/Student[] s =this.students;
	int j=0;
	for(int i=0;i<this.students.length;i++) {
	if(age==this.getCurrentAgeByDate(i)) {
	s[j]=this.students[i];
	j++;
	}
	}
	Student[] s1 = new Student[j+1];
	s1=s;
	return s1;
		
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		Student[] s =this.students;
	int count = Integer.MIN_VALUE;
	int j=0;
	for(int i=0;i<this.students.length;i++) {
	if(count<this.students[i].getAvgMark()) {
	s[j]=students[i];
	j++;
	}
	}
	Student[] s1 = new Student[j+1];
	s1=s;
	return s1;// Add your implementation here
		
	}

	@Override
	public Student getNextStudent(Student student) {
		if(student == null) {
	throw new IllegalArgumentException();
	}
	else {
	for(int i=0;i<this.students.length;i++) {
		if(this.students[i]==student) {
	return this.students[i+1];
	}
	}
	}
	return null;
	}// Add your implementation here
		
}
