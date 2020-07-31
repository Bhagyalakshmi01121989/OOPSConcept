package Abstract;

public class College extends University{


@Override
public void pg() {
	// TODO Auto-generated method stub
	System.out.println("pg-MCA");
	
}

@Override
public void Ug() {
	// TODO Auto-generated method stub
	System.out.println("Ug-BCA");
	
}

public static void main(String[] args) {
	College cg = new College();
	cg.pg();
	cg.Ug();
}

}