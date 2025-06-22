public class employee_ops{
		Employee[] arr;
		int count=0;
		
		public employee_ops(int capacity) {
	        arr= new Employee[capacity];
	    }

		
		void add_Emp(Employee e) {
			if (count < arr.length) {
	            arr[count++] = e;
	        } else {
	            System.out.println("Employee array is full!");
	        }
		}
		
		void search_Emp(int id) {
			for(int i=0;i<arr.length;i++) {
				if(id==arr[i].employeeId) {
					System.out.println("Employee found! ");
					break;
				}
				
			}
		}
		
		void traverse_Emp() {
			for(int i=0;i<count;i++) {
				System.out.println(arr[i].display());
			}
			
		}
		
		void delete_emp(int id) {
			for (int i = 0; i < count; i++) {
	            if (arr[i].employeeId == id) {
	                for (int j = i; j < count - 1; j++) {
	                    arr[j] = arr[j + 1];
	                }
	                arr[--count] = null;
	                System.out.println("Employee with ID " + id + " deleted.");
	          
	            }
	        }
	        System.out.println("Employee with ID " + id + " not found.");
		}
		
		
	
}