class Student:
    def __init__(self, name, grade, age):
        self.name = name
        self.grade = grade
        self.age = age
    
    def display(self):
        return f"Name - {self.name} \nGrade - {self.grade} \nAge - {self.age}"
    
class School(Student):
    def schoolStudentDisplay(self):
        return self.display()

student = School("Abc", "A+", 19)
print(student.schoolStudentDisplay())