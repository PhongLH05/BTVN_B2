package fpoly.acount.myapplication;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        RecyclerView recyclerDanhSach = findViewById(R.id.recyclerDanhSach);
        ArrayList<Product> lst = new ArrayList<>();
        lst.add(new Product(1, "Banh", 10000));
        lst.add(new Product(2, "Keo", 30000));
        lst.add(new Product(5, "Banh", 90000));

        ProductAdapter adapter = new ProductAdapter(lst);
        recyclerDanhSach.setAdapter(adapter);
        recyclerDanhSach.setLayoutManager(new LinearLayoutManager(this));
    }
}
