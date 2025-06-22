class main{
	public static void main(String [] args) {
		
		employee_ops manager = new employee_ops(3);
        manager.add_Emp(new Employee(101, "Alice", "Manager", 75000));
        manager.add_Emp(new Employee(102, "Bob", "Developer", 60000));
        manager.add_Emp(new Employee(103, "Charlie", "Analyst", 50000));

        System.out.println("\nAll Employees:");
        manager.traverse_Emp();

        System.out.println("\nSearch for ID 102:");
        manager.search_Emp(102);

        System.out.println("\nDelete Employee ID 101:");
        manager.delete_emp(101);
        manager.traverse_Emp();
	}
}