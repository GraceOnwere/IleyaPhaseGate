from unittest import TestCase

from level_two import *

class LevelTwoTest(TestCase):

    def test_that_i_have_an_array_and_i_return_an_array_of_its_duplicate(self):

        array = [1, 2, 3, 2, 4, 3]

        array_check = [2, 3]

        self.assertEqual(duplicate_check(array),array_check)

    def test_that_i_have_an_array_and_i_return_array_with_its_duplicates_and_indexes(self):

        array = [-11, -9, 3, -9, 2, -11]

        array_check = [ [-11, [0, 5] ], [-9, [1, 3] ] ]

        self.assertEqual(get_array_index_and_duplicate(array),array_check)

    def test_that_i_have_an_array_and_i_move_zero_elements_to_the_end_of_the_array(self):

        array = [5, 0 , 3, 0, 2, 0]

        array_check = [5, 3, 2,0,0,0]

        self.assertEqual(move_all_zeros_in(array),array_check)
