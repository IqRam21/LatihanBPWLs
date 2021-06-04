
package Pratikum_PBO_3;
public class Person {

    private Job job;

    public Person() {
        this.job = new Job();
        job.setSalary(1000L);
    }

    public long getSalary() {
        return job.getSalary();
    }


    public static void main(String[] args) {
            Person person = new Person();
            long salary = person.getSalary();

            System.out.println(salary);
        }

    }

