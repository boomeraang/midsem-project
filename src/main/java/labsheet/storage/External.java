package labsheet.storage;

public class External extends Storage
{
    public void PersistentSave(String x)
    {
        d.string_data += x;
    }

    public void Capacity(int size)
    {
        d.int_data = size;
    }
}