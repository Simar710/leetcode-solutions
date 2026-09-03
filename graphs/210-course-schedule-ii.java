class Solution {
public int[] findOrder(int numCourses, int[][] prerequisites) {
List<List<Integer>> graph = new ArrayList<>();

for(int i = 0; i < numCourses; i++){
graph.add(new ArrayList<>());
}

int[] indegree = new int[numCourses];
for(int p[]: prerequisites){
int prereq = p[1];
int courses = p[0];

graph.get(prereq).add(courses);
indegree[courses]++;
}

Queue<Integer> q = new LinkedList<>();

for(int i = 0; i < numCourses; i++){
if(indegree[i]==0){
q.add(i);
}
}

int [] order = new int[numCourses];
int index = 0;
while(!q.isEmpty()){
int curr = q.poll();

order[index++] = curr;

for(int nextCourse: graph.get(curr)){
if(--(indegree[nextCourse]) == 0){
q.add(nextCourse);
}
}
}

return index == numCourses ? order : new int[0];
}
}
