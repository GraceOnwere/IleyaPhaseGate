from unittest import TestCase

from perfect_square_array import *

class TestPerfectSquareArray(TestCase):

    def test_that_i_have_an_array_and_returns_elements_that_are_perfect_square(self):

        array =  [4, 7, 9, 10, 16, 18]

        array_check = [4, 9, 16]

        self.assertEqual(array_check,perfect_square_check(array))

        
