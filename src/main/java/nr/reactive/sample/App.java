package nr.reactive.sample;

import java.util.List;

import io.reactivex.Maybe;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.disposables.Disposable;
import io.reactivex.observables.GroupedObservable;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )   {
//
//    	Observable<String> source =
//               Observable.just("Alpha", "Beta", "Gamma", "Delta",
//                       "Epsilon");
//       Observable<GroupedObservable<Integer, String>> byLengths =
//               source.groupBy(s -> s.length());
//       byLengths.flatMapSingle(grp -> grp.toList())
//               .subscribe(System.out::println);
//       
       
       String strings[] = new String[]{"Hello", "World"};     // Array of resource
       
       		Observable.fromArray(strings)
       		.filter(s ->
       		s.contains("W"))
       	.subscribe(System.out::println);
    }
    
   
    
//    
//    .subscribe(s -> System.out.println(s),
//    		throwable -> throwable.printStackTrace(),() -> System.out.println("Emittion completed"));
}
