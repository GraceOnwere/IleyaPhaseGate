from student_grader import *

number_of_students = int(input("Enter number of students: "))

number_of_subjects = int(input("Enter number of subjects: "))

print()

print("Saving >>>>>>>>>>>>>>>>>>>>>>>>>>>>>")

print("Saved Successfully")

print()

student_subject_score = collect_each_students_score(number_of_students)

student_count = 1

for count in range(number_of_students):

    subject_count = 1

    print(f"Entering score for student {student_count}")

    print()

    for counter in range(number_of_subjects):

        print(f"Enter score for subject {subject_count}")

        subject_score = int(input())

        while subject_score < 0 or subject_score > 100:

            print("Student subject score should be between 0-100")

            print(f"Enter score for subject {subject_count}")
    
            subject_score = int(input())

        student_subject_score[count].append(subject_score)   

        subject_count = subject_count + 1

        print("Saving >>>>>>>>>>>>>>>>>>>>>>>>>>>>>")

        print("Saved Successfully")

        print()

    student_count = student_count + 1

print("================================================")

print("STUDENT\t\t",end=" ")

for count in range(number_of_subjects):

    print(f"SUB{count + 1}\t",end=" ")
    
print("TOT\tAVE\tPOS")

print("================================================")

student_counter = 1
for student in student_subject_score:
    
    print(f"Student {student_counter}",end="\t")

    for subjects in student:

        print(subjects,end="\t")
        
    student_counter = student_counter + 1
    print()





























print("================================================")

print("================================================")

#print(student_subject_score) 


        
