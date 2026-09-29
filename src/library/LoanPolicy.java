package library;

public class LoanPolicy {
<<<<<<< HEAD
    public int maxBooks(MemberType type) { return type == MemberType.STUDENT ? 3 : 2; }
=======
    public int maxBooks(MemberType type) { return type == MemberType.STUDENT ? 2 : 5; }
>>>>>>> lab-v1/ex04/faculty
    public int loanDays() { return 14; }
    public int overdueFee(int daysLate) { return Math.max(0, daysLate) * 100; }
}
