package training;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
public class StudentVolunteers {
	public static List<String> findStudentsWithIncompleteVolunteerEvents(
			List<String> students, Map<String, List<String>> attendeesMapping)
	{
		Map<String, Integer> studentsEventCount = students.stream().collect(Collectors.toMap(s->s, n ->0));
		
		attendeesMapping.values().forEach(list->list.stream().filter(student -> studentsEventCount.containsKey(student))
				.forEach(filteredStudent -> studentsEventCount.put(filteredStudent, 
						studentsEventCount.get(filteredStudent)+1)));
		return studentsEventCount.entrySet().stream().filter(map -> map.getValue()<2)
				.map(studentsWithIncompleteVolunteerEventsMap -> studentsWithIncompleteVolunteerEventsMap.getKey())
				.collect(Collectors.toList());

	}

	public static void main(String[] args) {
		List<String>students= List.of("Virya", "Wisher","Tanya","Shubhya","Aadya");
		Map<String, List<String>> attendeesMapping = Map.of("Farmer's Market", List.of("Virya", "Wisher","Tanya"),
				"Car Wash Fundraiser", List.of("Tanya","Aadya","Shubhya"),
				"Cooking Workshop",List.of("Shubhya","Aadya"),
				"Midnight Breakfast",List.of("Shubhya"));
		System.out.println("Students with incomplete volunteer events: "+findStudentsWithIncompleteVolunteerEvents(students, attendeesMapping));

	}

}
