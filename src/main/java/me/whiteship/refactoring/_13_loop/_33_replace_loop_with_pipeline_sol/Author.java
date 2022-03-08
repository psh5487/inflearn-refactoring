package me.whiteship.refactoring._13_loop._33_replace_loop_with_pipeline_sol;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Author {

    private String company;

    private String twitterHandle;

    public Author(String company, String twitterHandle) {
        this.company = company;
        this.twitterHandle = twitterHandle;
    }

    static public List<String> TwitterHandles(List<Author> authors, String company) {
        // 방법 1
//        var result = new ArrayList<String> ();
//        for (Author a : authors) {
//            if (a.company.equals(company)) {
//                var handle = a.twitterHandle;
//                if (handle != null)
//                    result.add(handle);
//            }
//        }
//        return result;

        // 방법 2
        // 람다 미사용
//        authors.stream().filter(new Predicate<Author>() {
//            @Override
//            public boolean test(Author author) {
//                return author.company.equals(company);
//            }
//        });

        // 람다 사용
        return authors.stream().filter(author -> author.company.equals(company))
                .map(author -> author.twitterHandle)
//                .filter(t -> t!= null)
                .filter(Objects::nonNull)
                .collect(Collectors.toList());
    }
}
