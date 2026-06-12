from unittest import TestCase

from student_grader import *

class TestStudentGrader(TestCase):

    def test_that_the_get_students_total_function_returns_array_of_each_students_score_for_all_subjects(self):

        students_scores_per_subject = [[67,21,49],[98,62,56],[78,83,66]]

        actual_students_total = [137,216,154,227]

        expected_students_total = get_students_total(students_scores_per_subject)

        self.assertEqual(actual_students_total,expected_students_total)

        
    def test_that_the_get_students_average_function_returns_array_of_each_students_score_for_all_subjects(self):
         
        students_scores_per_subject = [[67,21,49],[98,62,56],[78,83,66]]

        actual_students_average = [45.67,72.00,51.33,75.7]

        expected_students_average = get_students_average(students_scores_per_subject)

        self.assertEqual(actual_students_average,expected_students_average)

        
     def test_that_the_get_students_average_function_returns_array_of_each_students_score_for_all_subjects(self):
         
        students_scores_per_subject = [[67,21,49],[98,62,56],[78,83,66]]

        actual_students_average = [45.67,72.00,51.33,75.7]

        expected_students_average = get_students_average(students_scores_per_subject)

        self.assertEqual(actual_students_average,expected_students_average)

        

        
