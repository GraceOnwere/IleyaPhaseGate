def palindrome_check (array):

    new_array = [] 

    for index_count in range(len(array)- 1,-1,-1):

        new_array.append(array[index_count])

    if array == new_array:

        return True

    return False
