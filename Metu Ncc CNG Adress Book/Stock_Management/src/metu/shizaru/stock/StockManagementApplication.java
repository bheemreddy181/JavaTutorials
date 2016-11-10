

package metu.shizaru.stock;





import java.util.Scanner;
import java.util.ArrayList;

/**
 * 
 * @author MERVE 
 *
 */
public class StockManagementApplication {

	
	/**
	 * These keeps data in ArrayList
	 */
	
	ArrayList<Supplier> SuppliersInStock = new ArrayList<Supplier>();
	ArrayList<Product> productsInStock = new ArrayList<Product>();
	ArrayList<Order> orders = new ArrayList<Order>();
	
	
	/**
	 * 
	 */	

	Supplier supplierobj=new Supplier();
		Movie movie=new Movie();
		Book book=new Book();
		Music music=new Music() ;
		LocalSupplier l_supplier= new LocalSupplier();
		LocalSupplier l_supplier2= new LocalSupplier();
		ForeignSupplier f_supplier2= new ForeignSupplier();
		ForeignSupplier f_supplier3= new ForeignSupplier();
		ForeignSupplier f_supplier4= new ForeignSupplier();
		ForeignSupplier f_supplier= new ForeignSupplier();
		
	
		Scanner sc=new Scanner(System.in);
		
	/**
	 * menu
	 */
	
	
	
	 public void menu(){
	 int input;
	
		 
	
	 	System.out.println("----------------MENU----------------");
	 	System.out.println("Type 0 to exit");
	 	System.out.println("Type 1 to add a new product");
		System.out.println("Type 2 to remove a product");
		System.out.println("Type 3 to list all movie products");
		System.out.println("Type 4 to list all music products");
		System.out.println("Type 5 to list all book products ");
		System.out.println("Type 6 to list all suppliers");
		System.out.println("Type 7 to list all foreign suppliers");
		System.out.println("Type 8 to list all local suppliers");
		System.out.println("Type 9 to list all orders");
		System.out.println("Type 10 to increase product copy in stock");
		System.out.println("Type 11 to decrease product copy in stock");
		System.out.println("Type 12 to receive an order");
		System.out.println("Type 13 to see total products in stock");
		System.out.println("Type 14 to place an order");
		System.out.println("Type 15 to check status of products");
		
	 
	 
	 input=sc.nextInt();
		
		
	 	switch(input){
	 	case 0:break;
	 	case 1:addNewProduct();break;
	 	case 2:removeProduct();break;
	 	case 3:listAllMovieProducts();menu();break;
	 	case 4:listAllMusicProducts();menu();break;
	 	case 5:listAllBookProducts(); menu();break;
	 	case 6:listAllSuppliers();menu(); break;
	 	case 7:listAllForeignSuppliers();menu(); break;
	 	case 8:listAllLocalSuppliers(); menu();break;
	    case 9:listAllCurrentOrders(); menu(); break;
	 	case 10:increaseProductInStock(); break;
	 	case 11: decreaseProductInStock();break;
	 	case 12: receivedOrder(); break;
	 	case 13: totalProductInStock();menu();  break;
	 	case 14: placeOrder();  break;
	 	case 15: checkStatusOfProduct(); menu();break;
	 	default: System.out.print("Try again");
	
	    }
	  
	  }
	  
	
	  	public void addNewProduct(){
	  
	
	  		try{
	  		
	  		int i;
	  		System.out.println("1 for Movie, 2 for Muic, 3 for Book");
	  		i=sc.nextInt();
	  		
	  		if(i==1){
	  			
	  			/// VALIDATE WITH ID SINCE CAN BE DUBLÝCATED NAMES BOOK MOVIE
		        System.out.println("Type the id(barkod) of the movie");
		        
		        String mm=sc.next();
		        
		        
		        int d=0;
		        while(d!=productsInStock.size()){
		        	if(productsInStock.get(d)==null||productsInStock.get(d).getId().equals(mm)==false)
		        		
		        		d++;
		        	else {
		        		System.out.println("ALREADY EXIST");
		        	break;
		        	}
		        		
		        
		        
		        			
		        }
		        
		        
		        
		        if(d!=productsInStock.size()){menu();}
		        
		   //     for(int d=0;d<productsInStock.size();d++){
		     //   	if (productsInStock.get(d).getId().equals(mm))
		        		
		   //     		System.out.println("ALREADY EXIST");
		        movie.setId(mm);
		        movie.setTreshold(3);	   
//////////TRESHOLD
			
				
				
				System.out.println("Type how many copies you'll add");
				int kopya=sc.nextInt();
				if (kopya<=0){
					System.out.println("TRY AGAIN");
					menu();
				}
		
				
				
				if(kopya<3&&kopya>0){
					System.out.println("UNDER TRESHOLD");
				
				
				Order f_order= new Order();
				// f_order.setOrderNo(1);
				// f_order.setStatus(false);
				 f_order.setTotalOrder(3);
				 f_order.setOrderName(productsInStock.get(i).getTitle());
				 f_order.setOrderId(productsInStock.get(i).getId());
					supplierobj.checkStatus();
					
				 orders.add(f_order);
				 
				
				System.out.println("AUTOMATIC ORDER DONE");
				
				
				}
				
				movie.setTotallnStock(kopya);
				
						
		        	
		        		
		
		        
		        
		        
		        
		        
	  			System.out.println("Type the title of the movie");
				movie.setTitle(sc.next());
				
				System.out.println("Type price of the  of the movie");
				movie.setPrice(sc.nextDouble());
		
				
				
				
				
				
				System.out.print("Type the number of actors in the movie");
				
				int a_size;
				
				a_size = sc.nextInt() ;
				
				if (a_size<=0){
					System.out.println("TRY AGAIN");
					menu();
				}
				
				String [] actr= new String[a_size];
				for (int m=0 ; m < a_size; m++)
					
				{

				System.out.println("Type the actor name");							
				actr[m] = sc.next();
				
				}
				movie.setActors(actr);
				
				
			
				
				System.out.print("Type the number of directors in the movie");
				int d_size;
				d_size = sc.nextInt() ;
				
				
				if (d_size<=0){
					System.out.println("TRY AGAIN");
					menu();
				}
				
				String [] drc= new String[d_size];
				for (int m=0 ; m < d_size; m++)
					
				{
				System.out.println("Type the director name");						
				drc[m] = sc.next();
				
				}
				movie.setDirectors(drc);
				
				
				System.out.println("Type the studio of the movie");
				movie.setStudio(sc.next());
				System.out.println("Type the genre of the movie");
				movie.setMovieGenre(sc.next());
				
				
				
				
				System.out.println("How many suppliers does movie have?");
				int sup = sc.nextInt();
				
				if (sup<=0){
					System.out.println("TRY AGAIN");
					menu();
				}
				
				String[] supply= new String[sup];
		
					
				for (int t=0; t< sup; t++){
				
					
					
						System.out.println("1 for local supplier, 2 for foreign supplier");
						int stype= sc.nextInt();
						if (stype==1){
						
							System.out.println("Type the name of the supplier");
							String names= sc.next();	
	
							
							System.out.println("Type the local supplier id");
							String ls_id=sc.next();
							
						     int e=0;
						        while(e!=SuppliersInStock.size()){
						        	if(SuppliersInStock.get(e)==null||(SuppliersInStock.get(e).getName().equalsIgnoreCase(names)==false&&SuppliersInStock.get(e).getId().equals(ls_id)==false))
						        		
						        		e++;
						        	else {
						        		System.out.println("ALREADY EXIST");
						        	break;
						        	}
						        		
						        
						        
						        			
						        }
						        
						        
						        
						        if(e!=SuppliersInStock.size()){menu();}
						
							
						        l_supplier.setName(names);		
							
							
						
							
							
							
							
							
							
							
							
							
							
							
							l_supplier.setId(ls_id);
							
							supply[t]=ls_id;
							
							
							System.out.println("Type the address of the suplier");
						    l_supplier.setAddress(sc.next());
						    System.out.println("Type the contactPerson");
						    l_supplier.setContactPerson(sc.next());
						    System.out.println("Type the delivery method");
						    l_supplier.setDeliveryMethod(sc.next());
	                        	
						    SuppliersInStock.add(l_supplier);
	                     
	                     
						}	
						else if(stype==2){
					 
					    
					    
							System.out.println("Type the name of the supplier");
						String names=sc.next();
						  System.out.println("Type the foreign supplier id");
					      String fs_id=sc.next(); 
                        
                   
      int f=0;
      while(f!=SuppliersInStock.size()){
      	if(SuppliersInStock.get(f)==null||(SuppliersInStock.get(f).getName().equalsIgnoreCase(names)==false&&SuppliersInStock.get(f).getId().equals(fs_id)==false))
      		
      		f++;
      	else {
      		System.out.println("ALREADY EXIST");
      	break;
      	}
      		
      
      
      			
      }
      
      
      
      if(f!=SuppliersInStock.size()){menu();}
                           
                        
  	f_supplier.setName(names);        
                        
       
                        
                        
      
      
      
      
      
      
      
      
      
      f_supplier.setId(fs_id);
                            
							supply[t]=fs_id;
							
							System.out.println("Type the address of the suplier");
						    f_supplier.setAddress(sc.next());
						    System.out.println("Type the contactPerson");
						    f_supplier.setContactPerson(sc.next());
						    System.out.println("Type the taxPerGood");
						   int tax=sc.nextInt();
						    
						    if (tax<0){
						    	System.out.println("TRY AGAIN");
						    	menu();
						    }
						    f_supplier.setTaxPerGood(tax);
	                         	
						    SuppliersInStock.add(f_supplier);
						
						    
						    System.out.println("Foreýgn eklendi");
						    
						    
						}
						
					
					
					
				}
				
				
				movie.setSupplierName(supply);
		
		
				
				productsInStock.add(movie);
	//SUPPLÝER		}
			
				
				
			}
	  			
	  		
	  		
	  			
	  			
	  			
	  			else if(i==2){
				
	  				
	  			
	 
	/// VALIDATE WITH ID SINCE CAN BE DUBLÝCATED NAMES BOOK MOVIE
         
	 System.out.println("Type the id(barkod) of the music");
     
     String mm=sc.next();
     
     
     int d=0;
     while(d!=productsInStock.size()){
     	if(productsInStock.get(d)==null||productsInStock.get(d).getId().equals(mm)==false)
     		
     		d++;
     	else {
     		System.out.println("ALREADY EXIST");
     	break;
     	}
     		
     
     
     			
     }
     
     
     
     if(d!=productsInStock.size()){menu();}
     
//     for(int d=0;d<productsInStock.size();d++){
  //   	if (productsInStock.get(d).getId().equals(mm))
     		
//     		System.out.println("ALREADY EXIST");
     music.setId(mm);
     	   
     		
     	
     		
     		
     		
     music.setTreshold(3);
     System.out.println("Type how many copies you'll add");
 	int kopya=sc.nextInt();
 		if (kopya<=0){
 			System.out.println("TRY AGAIN");
 			menu();
 		}
 		
 		
 		
 		
 		if(kopya<3&&kopya>0){
			System.out.println("UNDER TRESHOLD");
		
		
		Order f_order= new Order();
		// f_order.setOrderNo(1);
		// f_order.setStatus(false);
		 f_order.setTotalOrder(3);
		 f_order.setOrderName(productsInStock.get(i).getTitle());
		 f_order.setOrderId(productsInStock.get(i).getId());
			supplierobj.checkStatus();
			
		 orders.add(f_order);
		 
		
		System.out.println("AUTOMATIC ORDER DONE");
		
 		
 		}
 		
 		
 		
 		
 		music.setTotallnStock(kopya);
 		
     
     
     
     
		System.out.println("Type the title of the music");
		music.setTitle(sc.next());
		
		System.out.println("Type price of ");
		music.setPrice(sc.nextDouble());

		
		
		
		
		
		
		
		System.out.println("Type the artist");
		music.setArtist(sc.next());
		System.out.println("Type the Record Company");
		music.setRecordCompany(sc.next());
		
		
		
		
		
		System.out.println("Type the genre");
		music.setMusicGenre(sc.next());
		
		
		
		
		
		System.out.println("How many suppliers does it have?");
		int sup = sc.nextInt();
		
		if (sup<=0){
			System.out.println("TRY AGAIN");
			menu();
		}
		
		String[] supply= new String[sup];

			
		for (int t=0; t< sup; t++){
		
			
			
				System.out.println("1 for local supplier, 2 for foreign supplier");
				int stype= sc.nextInt();
				if (stype==1){
				
					System.out.println("Type the name of the supplier");
						String names=sc.next();	
						System.out.println("Type the local supplier id");
						
						  String ls_id=sc.next();
				     int e=0;
				        while(e!=SuppliersInStock.size()){
		  	if(SuppliersInStock.get(e)==null||(SuppliersInStock.get(e).getName().equalsIgnoreCase(names)==false&&SuppliersInStock.get(e).getId().equals(ls_id)==false))
				        		
				        		e++;
				        	else {
				        		System.out.println("ALREADY EXIST");
				        	break;
				        	}
				        		
				        
				        
				        			
				        }
				        
				        
				        
				        if(e!=SuppliersInStock.size()){menu();}
				
					
					
				      
					
				    	l_supplier.setName(names);
					
					
					l_supplier.setId(ls_id);
					
					supply[t]=ls_id;
					
					
					System.out.println("Type the address of the suplier");
				    l_supplier.setAddress(sc.next());
				    System.out.println("Type the contactPerson");
				    l_supplier.setContactPerson(sc.next());
				    System.out.println("Type the delivery method");
				    l_supplier.setDeliveryMethod(sc.next());
                 	
				    SuppliersInStock.add(l_supplier);
              
              
				}	
				else if(stype==2){
			 
			    
			    
					System.out.println("Type the name of the supplier");
					String names= sc.next();
					System.out.println("Type the foreign supplier id");
					String fs_id=sc.next();
             
             
        
int f=0;
while(f!=SuppliersInStock.size()){
if(SuppliersInStock.get(f)==null||(SuppliersInStock.get(f).getName().equalsIgnoreCase(names)==false&&SuppliersInStock.get(f).getId().equals(fs_id)==false))
	
	f++;
else {
	System.out.println("ALREADY EXIST");
break;
}
	


		
}



if(f!=SuppliersInStock.size()){menu();}
             
             
             
             
             
             
             
             
             
             
             
             
             
             
f_supplier.setName(names);             
    
             
             f_supplier.setId(fs_id);
                 
					supply[t]=fs_id;
					
					System.out.println("Type the address of the suplier");
				    f_supplier.setAddress(sc.next());
				    System.out.println("Type the contactPerson");
				    f_supplier.setContactPerson(sc.next());
				    System.out.println("Type the taxPerGood");
				    int tax=sc.nextInt();
				    
				    if (tax<0){
				    	System.out.println("TRY AGAIN");
				    	menu();
				    }
				    f_supplier.setTaxPerGood(tax);
                  	
				    SuppliersInStock.add(f_supplier);
				
				    
				    System.out.println("Foreýgn eklendi");
				    
				    
				}
				
			
			
			
		}
		
		
		music.setSupplierName(supply);
        productsInStock.add(music);

	  				
	  				
	  				
	  				
	  				
	  				
			    
		    
			    
			} else if(i==3){
		
		
		/// VALIDATE WITH ID SINCE CAN BE DUBLÝCATED NAMES BOOK MOVIE
        System.out.println("Type the id(barkod) of the book");
        
        String mm=sc.next();
        
        
        int d=0;
        while(d!=productsInStock.size()){
        	if(productsInStock.get(d)==null||productsInStock.get(d).getId().equals(mm)==false)
        		
        		d++;
        	else {
        		System.out.println("ALREADY EXIST");
        	break;
        	}
        		
        
        
        			
        }
        
        
        
        if(d!=productsInStock.size()){menu();}
        
   //     for(int d=0;d<productsInStock.size();d++){
     //   	if (productsInStock.get(d).getId().equals(mm))
        		
   //     		System.out.println("ALREADY EXIST");
        book.setId(mm);
        	   
        		
        	
        		
    	
		System.out.println("Type how many copies you'll add");
		int kopya=sc.nextInt();
		if (kopya<=0){
			System.out.println("TRY AGAIN");
			menu();
		}
		
		if(kopya<3&&kopya>0){
			System.out.println("UNDER TRESHOLD");
		
		
		
		
		
		Order f_order= new Order();
		// f_order.setOrderNo(1);
		// f_order.setStatus(false);
		 f_order.setTotalOrder(3);
		 f_order.setOrderName(productsInStock.get(i).getTitle());
		 f_order.setOrderId(productsInStock.get(i).getId());
			supplierobj.checkStatus();
			
		 orders.add(f_order);
		 
		
		System.out.println("AUTOMATIC ORDER DONE");
		
		
		
		}
		
		
		
		book.setTotallnStock(kopya);		
        		
        
        
        
        
        
			System.out.println("Type the title");
		book.setTitle(sc.next());
		
		System.out.println("Type price");
		book.setPrice(sc.nextDouble());

		
		
		
		
		book.setTreshold(3);
		
		
		System.out.println("Type the genre");
		book.setBookGenre(sc.next());
		
	
		System.out.println("Type the ISBN");
		book.setIsbn(sc.next());	
		
		System.out.println("Type the AUTHOR");
		book.setAuthor(sc.next());
		
		System.out.println("Type the PUBLISHER");
		book.setPublisher(sc.next());
		
		
		
			
		
		
		
		
		System.out.println("How many suppliers?");
		int sup = sc.nextInt();
		
		if (sup<=0){
			System.out.println("TRY AGAIN");
			menu();
		}
		
		String[] supply= new String[sup];

			
		for (int t=0; t< sup; t++){
		
			
			
				System.out.println("1 for local supplier, 2 for foreign supplier");
				int stype= sc.nextInt();
				if (stype==1){
				
					System.out.println("Type the name of the supplier");
					String names=sc.next();
					System.out.println("Type the local supplier id");
					String ls_id=sc.next();
					
							
					
					
				     int e=0;
				        while(e!=SuppliersInStock.size()){
				        	if(SuppliersInStock.get(e)==null||(SuppliersInStock.get(e).getName().equalsIgnoreCase(names)==false&&SuppliersInStock.get(e).getId().equals(ls_id)==false))
				        		
				        		e++;
				        	else {
				        		System.out.println("ALREADY EXIST");
				        	break;
				        	}
				        		
				        
				        
				        			
				        }
				        
				        
				        
				        if(e!=SuppliersInStock.size()){menu();}
				
					
					
					
					
				        l_supplier.setName(names);	
					
					
					l_supplier.setId(ls_id);
					
					supply[t]=ls_id;
					
					
					System.out.println("Type the address of the suplier");
				    l_supplier.setAddress(sc.next());
				    System.out.println("Type the contactPerson");
				    l_supplier.setContactPerson(sc.next());
				    System.out.println("Type the delivery method");
				    l_supplier.setDeliveryMethod(sc.next());
                    	
				    SuppliersInStock.add(l_supplier);
                 
                 
				}	
	
		
		
		
		else if(stype==2){
			 
		    
		    
			System.out.println("Type the name of the supplier");
			String names= sc.next();
			System.out.println("Type the foreign supplier id");
			String fs_id=sc.next();    
			     
     

int f=0;
while(f!=SuppliersInStock.size()){
if(SuppliersInStock.get(f)==null||(SuppliersInStock.get(f).getName().equalsIgnoreCase(names)==false&&SuppliersInStock.get(f).getId().equals(fs_id)==false))

f++;
else {
System.out.println("ALREADY EXIST");
break;
}




}



if(f!=SuppliersInStock.size()){menu();}
     
     
     
     
     
     
     
     
     
     
     
     
     
     
f_supplier.setName(names);             

     f_supplier.setId(fs_id);
         
			supply[t]=fs_id;
			
			System.out.println("Type the address of the suplier");
		    f_supplier.setAddress(sc.next());
		    System.out.println("Type the contactPerson");
		    f_supplier.setContactPerson(sc.next());
		    System.out.println("Type the taxPerGood");
		    
		    int tax=sc.nextInt();
		    if (tax<0){
		    	System.out.println("TRY AGAIN");
		    	menu();
		    }
		    f_supplier.setTaxPerGood(tax);
          	
		    SuppliersInStock.add(f_supplier);
		
		    
		    System.out.println("Foreýgn eklendi");
		    
		    
		}
		
	
	
	
}

		
		
		
		
		
		
        book.setSupplierName(supply);
		
		
		
		productsInStock.add(book);
		
		
		
		
		
		
		
		
		
		
	   
				
			}  		
	
		
		
		
		
		
		
		
		
	
	  		
	  		
			
	  		menu();
	  		
	  			}
	  		
	  			catch(Exception e)
	  			{
	  			System.out.print("TRY AGAINNNN");
	  		
	  			
	  			/////////////////////////////////////////////////////////////
	  			
	  			}
	  			
	  			 }	  		
	  		
	  		
	  		
	  		
	 

	 
	  	
	  	
	  	
	  
	  	public void removeProduct(){
	  		
	  	
	  	
	  		//ÝDLERÝ BASTIR ÝSÝMLERLE
	  		

	  		listAllMovieProducts();
	  		listAllBookProducts();
	  		listAllMusicProducts();
	  		
	  		
	  		
	  		
	  		
	  		int idd;
			System.out.println("write id to delete product:");
			idd=sc.nextInt();
			
			for(int i=0;i<productsInStock.size();i++){
				if(productsInStock.get(i).getId().equals(idd))
					productsInStock.remove(i);
			}	
					
		
			 		
	 		menu();
	  				
	  	}
	
	
	
	public void listAllMusicProducts(){
		
	
		
		for(int i=0;i<productsInStock.size();i++){
			if ((productsInStock.get(i)!= null)&&(productsInStock.get(i).getClass()== music.getClass())){
			
				Music x =(Music) productsInStock.get(i);			
				
				String st="";
				for(int mn=0; mn < x.getSupplierName().length; mn++ ){
					st+= (x.getSupplierName()[mn]+" , ");
				
				}	
				
				
				
				System.out.println("TRESHOLD: "+x.getTreshold()+"\n"+"MUSIC ID: "+x.getId()+"\n"+"TITLE: "+x.getTitle()+"\n"+"PRICE: "+x.getPrice()+"\n"+"TOTALINSTOCK: "+ x.getTotallnStock()+"\n"+"ARTIST: "+x.getArtist()+"\n"+"RECORDCOMPANY: "+x.getRecordCompany()+"\n"+"GENRE: "+ x.getMusicGenre());
				System.out.println("SUPPLIERS: "+st+"\n");
				
				
						
					
							
						}
						
					}
					
					
					
					
					
			
					
					}
	
	
	public void listAllMovieProducts(){
		
		
		
		for(int i=0;i<productsInStock.size();i++){
			if ((productsInStock.get(i)!= null)&&(productsInStock.get(i).getClass()== movie.getClass())){
			
			     
				Movie x =(Movie) productsInStock.get(i);
				
			
				
				
				    String dir="";
				 	for(int k=0; k < x.getDirectors().length; k++ ){
				 		
				 	
				 		dir+= (x.getDirectors()[k]+"");
				
				
				 	}
					
				 	String act="";
						for(int m=0; m < x.getActors().length; m++ ){
							act+= (x.getActors()[m]+"");
						
						}	
						
						String st="";
						for(int mn=0; mn < x.getSupplierName().length; mn++ ){
							st+= (x.getSupplierName()[mn]+" , ");
						
						}	
							
				
							
							
			System.out.println("MOVIE ID: "+x.getId()+"\n"+"TITLE: "+x.getTitle()+"\n"+"PRICE: "+x.getPrice()+"\n"+"STUDIO: "+x.getStudio()+"\n"+"TOTAL IN STOCK: "+ x.getTotallnStock()+"\n"+"ACTORS OF THE MOVIE: "+act+"\n"+"DIRECTORS OF THE MOVIE: "+dir+"\n"+"MOVIE GENRE: " +x.getMovieGenre()+"\n"+"TRESHOLD VALUE: "+x.getTreshold());
			System.out.println("SUPPLIERS: "+st+"\n");
			
	
			}			
			
			
			
				
			}
			
		}
		
		
		
		
		
		
		
		
		
		

	
	public void listAllBookProducts(){
		for(int i=0;i<productsInStock.size();i++){
			if ((productsInStock.get(i)!= null)&&(productsInStock.get(i).getClass()== book.getClass())){
			
				Book x =(Book) productsInStock.get(i);			
				
				String st="";
				for(int mn=0; mn < x.getSupplierName().length; mn++ ){
					st+= (x.getSupplierName()[mn]+" , ");
				
				}	
				
				
				
				System.out.println("TRESHOLD: "+x.getTreshold()+"\n"+"BOOKID: "+x.getId()+"\n"+"NAME: " +x.getTitle()+"\n"+"PRICE: "+x.getPrice()+"\n"+"TOTALINSTOCK: "+ x.getTotallnStock()+"\n"+"AUTHOR: "+x.getAuthor()+"\n"+"GENRE: "+x.getBookGenre()+"\n"+"ISBN: "+ x.getIsbn()+"\n"+"PUBLISHER: "+x.getPublisher());
				System.out.println("SUPPLIERS: "+st);
				
				
						}			
						
						
					
							
						}
						
					}
					
					
					
					
					
					
					
					
					
				
				
				
		
	
		
		
		public void listAllForeignSuppliers(){
			
			
			for(int i=0;i<SuppliersInStock.size();i++){
				if ((SuppliersInStock.get(i)!= null)&&(SuppliersInStock.get(i).getClass()== f_supplier.getClass())){
				
					ForeignSupplier x =(ForeignSupplier) SuppliersInStock.get(i);			
					System.out.println("SUPPLIERID: "+x.getId()+"\n"+"NAME"+x.getName()+"\n"+"ADDRESS: "+x.getAddress()+"\n"+"CONTACT PERSON: "+ x.getContactPerson()+"\n"+"TAXPERGOOG: "+x.getTaxPerGood()+"\n"+"\n");
					
		
				}
			
			}
			
			
			
		
			
			}
		public void listAllLocalSuppliers(){
			
			
			for(int i=0;i<SuppliersInStock.size();i++){
				if ((SuppliersInStock.get(i)!= null)&&(SuppliersInStock.get(i).getClass()== l_supplier.getClass())){
				
					LocalSupplier x =(LocalSupplier) SuppliersInStock.get(i);			
					System.out.println("SUPPLIER ID: "+x.getId()+"\n"+"NAME: "+x.getName()+"\n"+"ADDRESS: "+x.getAddress()+"\n"+"CONTACTPERSON: "+ x.getContactPerson()+"\n"+"DELIVERY METHOD: "+x.getDeliveryMethod()+"\n"+"\n");
					
		
				}
			}
			
			
			
			
		}
		
		
	public void listAllSuppliers(){
		System.out.println("FOREIGN SUPPLIERS:");
		listAllForeignSuppliers();	
		System.out.println("LOCAL SUPPLIERS:");
			listAllLocalSuppliers();
			System.out.println(" -------------------");
		
			
			
			
			
		}
		public void listAllCurrentOrders(){
			System.out.println("CURRENTLY RECEIVED ORDERS:");
			
			for(int i=0;i<orders.size();i++){
				if (orders.get(i)!= null&&orders.get(i).isStatus()==true){
					
					
					System.out.println("ORDERED PRODUCT NAME: "+orders.get(i).getOrderName()+"\n"+"PRODUCT ID: "+orders.get(i).getOrderId()+"\n"+"ORDERED COPY: "+orders.get(i).getTotalOrder()+"\n"+"RECEIVE STATUS: "+orders.get(i).isStatus());
					
					
					
				}
				
			}
			System.out.println("CURRENTLY NOT RECEIVED ORDERS:");
			
			for(int i=0;i<orders.size();i++){
				if (orders.get(i)!= null&&orders.get(i).isStatus()==false){
					
					
					System.out.println("ORDERED PRODUCT NAME: "+orders.get(i).getOrderName()+"\n"+"PRODUCT ID: "+orders.get(i).getOrderId()+"\n"+"ORDERED COPY: "+orders.get(i).getTotalOrder()+"\n"+"RECEIVE STATUS: "+orders.get(i).isStatus());
					
					
					
				}
				
			}
			
			
			
		}
		public void increaseProductInStock(){
		
			listAllMovieProducts();
			listAllMusicProducts();
			listAllBookProducts();
				
			
			
		try
		{
			String idd;
			System.out.println("write id to increase product:");
			idd=sc.next();
			System.out.println("How many copies will be decreased?");
			int copy=sc.nextInt();
			if(copy<0){
				System.out.println("TRY AGAIN");
				menu();
			}
			
			for(int i=0;i<productsInStock.size();i++){
				if(productsInStock.get(i).getId().equals(idd))
					productsInStock.get(i).setTotallnStock(productsInStock.get(i).getTotallnStock()+copy);
				
				
				
			}
			
			menu();
		}
		catch(Exception e){
		System.out.print("TRY AGAIN");
		
		
		}
		
		
		}
				
		
		
		
		public void decreaseProductInStock(){
          
			
			listAllMovieProducts();
			listAllMusicProducts();
			listAllBookProducts();
			
			
			
			
			try{
	  		String idd;
			System.out.println("write id to decrease product:");
			idd=sc.next();
			
			System.out.println("How many copies will be decreased?");
			int copy=sc.nextInt();
			
			if(copy<0){
				System.out.println("TRY AGAIN");
				menu();
			}
			for(int i=0;i<productsInStock.size();i++){
				if(productsInStock.get(i).getId().equals(idd))
					productsInStock.get(i).setTotallnStock(productsInStock.get(i).getTotallnStock()-copy);
				
				
				
				
				
	////////////////////////check status
					
					if (productsInStock.get(i).getTotallnStock()< productsInStock.get(i).getTreshold()){
						System.out.println(productsInStock.get(i).getId()+" "+productsInStock.get(i).getTitle());
						System.out.println("UNSUFFIENT COPY OF "+productsInStock.get(i).getTotallnStock()+" "+"TRESHOLD : "+productsInStock.get(i).getTreshold());
		///////////////////
						//////////valýdate
						int f=0;
						while(f!=orders.size()){
						if(orders.get(f)==null||orders.get(f).getOrderId().equals(idd)==false)

						f++;
						else {
						System.out.println("ALREADY ORDERED");
						break;
						}




						}



						if(f!=orders.size()){menu();}
						
						
						
						
						
						
						
						
						
						//	placeOrder();
		///////////////////////////////////////////// baþka foksiyona at
								
						
						
						
						
						
						Order f_order= new Order();
						// f_order.setOrderNo(1);
						// f_order.setStatus(false);
						 f_order.setTotalOrder(3);
						 f_order.setOrderName(productsInStock.get(i).getTitle());
						 f_order.setOrderId(productsInStock.get(i).getId());
							supplierobj.checkStatus();
							
						 orders.add(f_order);
						 
						
						System.out.println("AUTOMATIC ORDER DONE");
						
						//otomatik order

					
						 
						
					}
				
				
					
					
					
					
			}
			
			menu();
           }
			
           
           catch(Exception e){
        	   System.out.print("TRY AGAIN");
           }
           
           
		}
		
		public void receivedOrder(){
		 
			
			listAllCurrentOrders();
			
			
			System.out.println("Type the id of the ordered product you want to receive");
			String ord=sc.next();
			for(int at=0;at<orders.size();at++){
			
					
				if(orders.get(at)!=null&&(orders.get(at).getOrderId().equals(ord))){
					
				
					
					for(int i=0;i<productsInStock.size();i++){
						if(productsInStock.get(i).getId().equals(ord))
							productsInStock.get(i).setTotallnStock(	productsInStock.get(i).getTotallnStock()+orders.get(at).getTotalOrder());
					//receive order
	//	productsInStock.get(b).setTotallnStock(	productsInStock.get(b).getTotallnStock()+n_copy);
					
					}
			
					orders.get(at).setStatus(true);
				
				}
			
			
			
			
			}
			
			
			System.out.println("ORDER RECEIVED");
			
			
			menu();
		}
		
		public void totalProductInStock(){
			int msum=0;
			int mosum=0;
			int bsum=0;
			int totalsum=0;
			int c_mu=0;
			int c_mo=0;
			int c_bo=0;
			System.out.println("MUSICS--------------------- ");
			for(int i=0;i<productsInStock.size();i++){
				
					if ((productsInStock.get(i)!= null)&&(productsInStock.get(i).getClass()== music.getClass())){
					
						Music x =(Music) productsInStock.get(i);
						c_mu++;			
						msum+=x.getTotallnStock();
						
						
					System.out.println(x.getTitle()+" "+x.getTotallnStock()+"\n");
					
					}
			}
			
			
			 System.out.println("MOVIES--------------------- ");
					for(int a=0;a<productsInStock.size();a++){	
					
					
					
						if ((productsInStock.get(a)!= null)&&(productsInStock.get(a).getClass()== movie.getClass())){
						Movie x =(Movie) productsInStock.get(a);
						System.out.println(x.getTitle()+" "+x.getTotallnStock()+"\n");
						mosum+=x.getTotallnStock();
						c_mo++;
						}	
					}	
					
			 System.out.println("BOOKS--------------------- ");		
				for(int b=0;b<productsInStock.size();b++){
					
					
					
					if ((productsInStock.get(b)!= null)&&(productsInStock.get(b).getClass()== book.getClass())){
							
								Book x =(Book) productsInStock.get(b);
								System.out.print("BOOKS--------------------- "+"\n"+x.getTitle()+" "+x.getTotallnStock()+"\n");
								bsum+=x.getTotallnStock();
								c_bo++;
					}
			
				}
				
				
					
			totalsum=mosum+msum+bsum;
			
			System.out.println(  "NUMBER OF TOTAL PRODUCTS IN STOCK: "+totalsum);
			System.out.println(  c_mo+" DIFFERENT MOVIES");
			System.out.println(  "MOVIE COPIES IN TOTAL            : "+mosum);
			System.out.println(  c_mu+" DIFFERENT MUSICS");
			System.out.println(  "MUSIC COPIES IN TOTAL            : "+msum);
			System.out.println(  c_bo+" DIFFERENT BOOKS");
			System.out.println(  "BOOK COPIES IN TOTAL             : "+bsum);
			
			
		}
				
				
			
			
			
			
				
				
			
			
			
			
		
		public void placeOrder(){
			
			try{
			for(int b=0;b<productsInStock.size();b++){
				
				System.out.println(productsInStock.get(b).getId()+" "+productsInStock.get(b).getTitle()+" "+"COPY: "+productsInStock.get(b).getTotallnStock());
			}
				
				
				
				System.out.println("Type the id of the product you want to order");
				String ord=sc.next();
				
				
				
			//	ððððððððððððð
				
				
				int d=0;
		        while(d!=orders.size()){
		        	if(orders.get(d)==null||orders.get(d).getOrderId().equals(ord)==false)
		        		
		        		d++;
		        	else {
		        		System.out.println("ALREADY ORDERED");
		        	break;
		        	}
		        		
		        
		        
		        			
		        }
		        
		        
		        
		        if(d!=orders.size()){menu();}
				
				
				
				
				
			//	ððððððððððððð
				
				for(int at=0;at<productsInStock.size();at++){
				
						
					if(productsInStock.get(at)!=null&&(productsInStock.get(at).getId().equals(ord))){
						
						System.out.print("How many copies will you order?");
						int n_copy=sc.nextInt();

							if(n_copy<0){
								supplierobj.placeOrder();
								
								}

							else {
								
								Order f_order= new Order();
								// f_order.setOrderNo(1);
								 f_order.setStatus(false);
								 f_order.setTotalOrder(n_copy);
								 f_order.setOrderName(productsInStock.get(at).getTitle());
								 f_order.setOrderId(productsInStock.get(at).getId());
								
								 orders.add(f_order);
								 
								
								System.out.println("ORDER DONE");
							}
					
					
					}
				
	
				
				
			
				
				
				
			}
			menu();
			}
				catch(Exception e){
				System.out.print("TRY AGAIN");
				
				}
			
			
			
			
			
			
			
		}
		public void checkStatusOfProduct(){
			
			
			for(int b=0;b<productsInStock.size();b++){
				
				
				if (productsInStock.get(b).getTotallnStock()< productsInStock.get(b).getTreshold()){
					System.out.println(productsInStock.get(b).getId()+" "+productsInStock.get(b).getTitle());
					System.out.println("UNSUFFIENT COPY OF "+productsInStock.get(b).getTotallnStock()+" "+"TRESHOLD : "+productsInStock.get(b).getTreshold());
					
					
					
					
				}
					else System.out.println(productsInStock.get(b).getId()+" "+productsInStock.get(b).getTitle()+" "+"SUFFIENT COPY OF "+productsInStock.get(b).getTotallnStock());
					
			}
				
		
			
		
			
				
		
		}
				
				
				
			
			
			
			
			
		
	   
	
	
	
	///////////// SUPPLÝER INITIALIZE ET
	  	
	
	
		public void SetMovies(){
			Movie first=new Movie();
			first.setTitle("The Shawshank Redemption");
		    String[] init=new String[2];
	        init[0]="Company";
	        init[1]="MOVIECOMPANY";
			first.setSupplierName(init);
			first.setTreshold(3);
			first.setTotallnStock(5);
			
			String[] actors = new String[3];
			actors[0] = "Morgan Freeman";
			actors[1] =  "Tim Robbins";
			actors[2] =  "Bob Gunton";
			
			first.setActors(actors);
			
			String[] directors = new String[1];
			directors[0]= "Frank Darabont";
		   
			first.setDirectors(directors);
			
		    first.setId("148");
		    first.setMovieGenre("Crime|Drama");
		    first.setPrice(10);
		    first.setStudio("USA");
		    
		    l_supplier.setId("147");
		    l_supplier.setName("Company");
		    l_supplier.setDeliveryMethod("Airline");
		    l_supplier.setContactPerson("Human Resources");
		    l_supplier.setAddress("Hollywood");
		    
		    f_supplier2.setId("150");
		    f_supplier2.setName("MOVIECOMPANY");
		    f_supplier2.setTaxPerGood(8);
		    f_supplier2.setContactPerson("ACTOR");
		    f_supplier2.setAddress("FRANCE");

		    
		    
		    productsInStock.add(first);
	        SuppliersInStock.add(l_supplier);
	        SuppliersInStock.add(f_supplier2);
	        //////////////////////////////////////

	        Movie second=new Movie();
			second.setTitle("The Incredibles");
		    String[] inital=new String[1];
	        inital[0]="PIXAR";
	        
			second.setTreshold(3);
			second.setTotallnStock(10);
			
			
			second.setSupplierName(inital);
			String[] acto = new String[2];
			acto[0] = "Richard Gere";
			acto[1] =  "Nicole Kidman";
			
			
			second.setActors(acto);
			
			String[] directo = new String[1];
			directo[0]= "Sinan Çetin";
		   
			second.setDirectors(directo);
			
		    second.setId("151");
		    second.setMovieGenre("Comedy");
		    second.setPrice(20);
		    second.setStudio("uk");
		    
		    l_supplier2.setId("432");
		    l_supplier2.setName("PIXAR");
		    l_supplier2.setDeliveryMethod("METHOD");
		    l_supplier2.setContactPerson("DIRECTOR");
		    l_supplier2.setAddress("HOLLYWOOD");
		    
		 
		    
		    productsInStock.add(second);
	        SuppliersInStock.add(l_supplier2);
	         
	        

	        
	     
	
		}
	
	
	  	
	  	public void SetMusics(){
	  		
	  		
	  		Music third= new Music("Madonna","RECORD","pop");
	  		third.setId("152");
	  		third.setPrice(4);
	  		
	  		
	  		String[] supid= new String[1];
	  		supid[0]="music COMPANY";
	  		third.setSupplierName(supid);
	  		third.setTitle("MUSIC TITLE");
	  		third.setTotallnStock(7);
	  		third.setTreshold(3);
	  		
	  		
	  	    f_supplier3.setId("153");
		    f_supplier3.setName("musýc COMPANY");
		    f_supplier3.setTaxPerGood(6);
		    f_supplier3.setContactPerson("secretary");
		    f_supplier3.setAddress("germany");
		    
		    productsInStock.add(third);
	        SuppliersInStock.add(f_supplier3); 
	        	
	  		
	  		
	  	}
	  	
	  	public void SetBooks(){
	  		
	  		Book four= new Book();
	  		
	  		four.setAuthor("VC. ANDREWS");
	  		four.setBookGenre("horror");
	  		four.setId("155");
	  		four.setPrice(432);
	  		four.setIsbn("542345");
	  		four.setPublisher("publis");
	  		String[] ids= new String[1];
	  		ids[0]="book COMPANY";
	  		four.setSupplierName(ids);
	  		
	  		four.setTitle("TheBook");
	  		four.setTotallnStock(3);
	  		four.setTreshold(3);
	  		
	  		
	  	   f_supplier4.setId("154");
		    f_supplier4.setName("book COMPANY");
		    f_supplier4.setTaxPerGood(4);
		    f_supplier4.setContactPerson("person");
		    f_supplier4.setAddress("denmark");
		    
		    productsInStock.add(four);
	        SuppliersInStock.add(f_supplier4); 
	  		
	  		
	  	}
	  	
	  	/**
	  	 * 
	  	 * @param args
	  	 */
	  	public static void main(String[] args) {
	

		
	StockManagementApplication merve= new StockManagementApplication();
	merve.SetMovies();
	merve.SetMusics();
	merve.SetBooks();
	merve.menu();
	
		
		
		
		
		
	     }

}
