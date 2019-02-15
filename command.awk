BEGIN {
	records	= 0;
	sum		= 0;
}
{
	sum 	+= $4;
	records += 1;
}

END {
	print("Avg: %.2f\n",sum/records);
}

# to run this command awk -f cmd.txt sutdents.txt