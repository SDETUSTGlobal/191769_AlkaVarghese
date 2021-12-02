from scipy import linalg
import numpy as np
# define square matrix
two_d_array = np.array([ [4,5], [3,2] ])
#pass value to function inv()
print(linalg.inv( two_d_array ))
