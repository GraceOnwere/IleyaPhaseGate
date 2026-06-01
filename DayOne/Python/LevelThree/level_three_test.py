from unittest import TestCase

from level_three import *

class LevelThreeTest(TestCase):

    def test_that_i_have_a_2D_array_and_i_flatten_it_into_a_new_array(self):

        array = [[9, 0, 7], [3, 5, 1], [8, 1, 7], [9, 9, 6]]

        array_check = [9,0,7,3,5,1,8,1,7,9,9,6]

        self.assertEqual(get_flatten_array(array),array_check)
