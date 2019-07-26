Feature: Datatable with map and list and list of list

Scenario: All examples of datatable
Given firstname and lastname and birthDate
| firstName   | lastName | birthDate  |
| Annie M. G. | Schmidt  | 1911-03-20 |
| Roald       | Dahl     | 1916-09-13 |
| Astrid      | Lindgren | 1907-11-14 |
Then print in three formats map and list and list of list