def array_split(array):

    new_array = [[], []]

    for new_array_index_count in range(len(array)):

        if array[new_array_index_count] % 2 == 0: new_array[0].append(array[new_array_index_count]);

        else: new_array[1].append(array[new_array_index_count]);

    return new_array
