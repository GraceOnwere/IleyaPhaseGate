from unittest import TestCase

from palindromic_array import *

class TestPalindromicArray(TestCase):

    def test_that_an_array_is_a_palindrome_returns_false(self):

        array = [45, 0, 8, 0, 1]

        array_check = palindrome_check(array)

        self.assertFalse(array_check)

    def test_that_an_array_is_a_palindrome_returns_true(self):

        array = [45, 0, 8, 0, 45]

        array_check = palindrome_check(array)

        self.assertTrue(array_check)
