from unittest import TestCase

from split_array import *

class TestSplitArray(TestCase):

    def test_that_an_array_splits_into_even_and_odd(self):

        array = [45, 60, 3, 10, 9, 22];

        arrayCheck = [[60, 10, 22],[45, 3, 9]];

        actual = array_split(array);

        self.assertEqual(actual,arrayCheck);
          
