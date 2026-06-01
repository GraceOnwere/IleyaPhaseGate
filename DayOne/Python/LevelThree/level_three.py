def get_flatten_array(array):

    new_array = []

    for row in array:

        for item in row:

            new_array.append(item)

    return new_array

#print(flatten_array([[9, 0, 7], [3, 5, 1], [8, 1, 7], [9, 9, 6]]))
