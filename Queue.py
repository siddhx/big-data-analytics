# q = Queue([])

class Queue:
	def __init__(self, aList = []):
		self.aList = aList
		self.index = 0
	# add item to queue
	def enqueue(self, item):
		self.aList.append(item)

	def dequeue(self):
		return self.aList.pop(0)

	def __iter__(self):
		return self

	def __next__(self):
		num = self.index
		if self.index == len(self.aList):
			self.index = 0
			raise StopIteration
		self.index += 1
		return self.aList[num]

	#canonical representation
	def __repr__(self):
		return "Queue:" + str(self.aList)

	def __str__(self):
		return str(self.aList)