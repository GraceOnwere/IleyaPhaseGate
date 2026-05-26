from unittest import TestCase

from non_perfect_square_array import *

class TestPerfectSquareArray(TestCase):

    def test_that_i_have_an_array_and_replace_elements_that_are_perfect_squares_with_minus_one(self):

        array =  [4, 7, 9, 10, 49, 6]

        array_check =  [4, -1, 9, -1, 49, -1]

        self.assertEqual(array_check,non_perfect_square_check(array))

        
