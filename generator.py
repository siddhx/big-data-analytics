def f(aList):
	result = []
	for number in aList:
		result.append(number ** 2)
	return result

def g(aList):
	for number in aList:
		yield number ** 2

print(f([10,20,30,40]))