select *
from (select bel.list_id    as "id",
             bel."position" as "position",
             bel.fruit_id   as "fruit_id",
             fru."name"     as "fruit_name"
      from public.belonging bel
               inner join
           public.fruits fru on (fru.id = bel.fruit_id)
      where bel.list_id = 1
      order by bel."position") bf;