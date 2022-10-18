public class AverageAge
{
    public String averageAgeCalculator(String[] ageRawData)
    {
        double avg = 0;
        double sum = 0;
        try{
            for(int i=0; i<ageRawData.length;i++)
            {
                sum = sum + Integer.parseInt(ageRawData[i]);
                avg = sum/ageRawData.length;
            }
        }
        catch (Exception exception)
        {
            return exception.toString();
        }
        return String.valueOf(avg);
    }
    public static void main(String[] args)
    {
        String [] age = {"35","26","thirty-two","44"};
        AverageAge averageAge = new AverageAge();
        String average = averageAge.averageAgeCalculator(age);
        System.out.println("Average age = "+average);

    }
}
