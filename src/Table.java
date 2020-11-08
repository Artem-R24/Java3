
class Table {
	long add_time, remove_time, get_time;
	Table()
	{
		add_time=remove_time=get_time=0;
	}
	void set_add(long value)
	{
		add_time=value;
	}
	void set_remove(long value)
	{
		remove_time=value;
	}
	void set_get(long value)
	{
		get_time=value;
	}
	void print_table()
	{
		System.out.println("Adding: "+add_time+" ms");
		System.out.println("Removing: "+remove_time+" ms");
		System.out.println("Getting: "+get_time+" ms");
	}
}
