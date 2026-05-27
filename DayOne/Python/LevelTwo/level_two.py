def get_duplicate_count(array):

    count = 0;

    for outer_index in range(len(array)):

        for inner_index in range(outer_index + 1, len(array)):

            if array[outer_index] == array[inner_index]:
                count = count +1
                break;
    return count



def duplicate_check(array):

    new_array = []

    for outer_index in range(len(array)):

        for inner_index in range(outer_index + 1, len(array)):

            if array[outer_index] == array[inner_index]:

                new_array.append(array[outer_index])
                break;

    return new_array

def get_array_index_and_duplicate(array):

    count = get_duplicate_count(array)

    new_array = [[] for _ in range(count)]

    counter = 0;

    for outer_index in range(len(array)):

        for inner_index in range(outer_index + 1, len(array)):

            if array[outer_index] == array[inner_index]:

                new_array[counter].append(array[outer_index])

                new_array[counter].append([outer_index,inner_index])

                counter = counter +1
                break;

    return new_array

def move_all_zeros_in(array):
    
    count = 0

    for index in range(len(array)):

        if array[index] == 0:

            count = count + 1
    
    for _ in range(count):

        for outer_index in range(len(array)-1):

            if array[outer_index] == 0 and array[outer_index + 1]  != 0:

                temp = 0

                temp = array[outer_index + 1] 

                array[outer_index + 1] = array[outer_index]

                array[outer_index] = temp    

    return array
