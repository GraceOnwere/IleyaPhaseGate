def collect_each_students_score(number_of_students):

    student_subject_score = []

    for student in range(number_of_students):

        student_subject_score.append([])

    return student_subject_score


def get_students_total(each_students_score):

    each_students_average = []

    for student in each_students_score:

        total = 0

        for subject_score in student:

            total += subject_score

        each_students_average.append(total)

    return each_students_average


def get_students_average(each_students_score):

    each_students_total = []    

    number_of_subjects = len(each_students_score[0])

    for student in each_students_score:

        average = 0.0

        for subject_score in student:

            average += subject_score

        each_students_total.append(average)

    return each_students_total


def get_students_postion(each_students_total):

    students_position = []

    sorted_students_total = sorted(each_students_total,reverse=True)

    for students_total in each_students_total:

        for element in sorted_students_total:

            if students_total == element:
                
                position = sorted_students_total.index(element) + 1

                students_position.append(position)

    return students_position


def get_highest_and_lowest_scoring_student_per_subject(each_students_score):

    highest_and_lowest_score_per_subject = []

    for subject_count in range(len(each_students_score[0])):

        highest_and_lowest_score_per_subject.append([])

    for subject_index in range(len(each_students_score[0])):

        highest_score = each_students_score[subject_index][subject_index]

        lowest_score = each_students_score[subject_index][subject_index]
        
        for student_index in range(len(each_students_score)):

            if each_students_score[student_index][subject_index] > highest_score:

                highest_score = each_students_score[student_index][subject_index]

            if each_students_score[student_index][subject_index] < lowest_score:

                lowest_score = each_students_score[student_index][subject_index]
        
        highest_and_lowest_score_per_subject[subject_index].append(highest_score)

        highest_and_lowest_score_per_subject[subject_index].append(lowest_score)

    return highest_and_lowest_score_per_subject

#
#def get_highest_scoring_student(number_of_students):
#
#    student_subject_score = collect_each_students_score(number_of_students)
#
#    highest_and_lowest_score_per_subject = get_highest_and_lowest_scoring_student_per_subject(student_subject_score)
#
#    
#    for subject in highest_and_lowest_score_per_subject:
#
#        for highest_score in subject:
#
#            if highest_score in student_subject_score
#
#            return student_subject_score.index(highest_score) + 1
#
#    return -1


    
           























#arr = [[67,21,49],[98,62,56],[78,83,66]]
#
#print(get_highest_and_lowest_scoring_student_per_subject(arr))
#
#
#        



