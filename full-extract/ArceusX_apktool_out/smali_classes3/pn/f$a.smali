.class public Lpn/f$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lpn/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lrn/e;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lqn/b;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lsn/a;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lqn/e;",
            ">;"
        }
    .end annotation
.end field

.field public final e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lpn/h;",
            ">;"
        }
    .end annotation
.end field

.field public final f:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/Character;",
            ">;"
        }
    .end annotation
.end field

.field public g:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/Class<",
            "+",
            "Lon/a;",
            ">;>;"
        }
    .end annotation
.end field

.field public h:Lpn/d;

.field public i:Lpn/a;

.field public j:I


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lpn/f$a;->a:Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lpn/f$a;->b:Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lpn/f$a;->c:Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lpn/f$a;->d:Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lpn/f$a;->e:Ljava/util/List;

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lpn/f$a;->f:Ljava/util/Set;

    invoke-static {}, Lln/k;->t()Ljava/util/Set;

    move-result-object v0

    iput-object v0, p0, Lpn/f$a;->g:Ljava/util/Set;

    sget-object v0, Lpn/a;->a:Lpn/a;

    iput-object v0, p0, Lpn/f$a;->i:Lpn/a;

    const v0, 0x7fffffff

    iput v0, p0, Lpn/f$a;->j:I

    return-void
.end method

.method public static bridge synthetic a(Lpn/f$a;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lpn/f$a;->a:Ljava/util/List;

    return-object p0
.end method

.method public static bridge synthetic b(Lpn/f$a;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lpn/f$a;->c:Ljava/util/List;

    return-object p0
.end method

.method public static bridge synthetic c(Lpn/f$a;)Ljava/util/Set;
    .locals 0

    iget-object p0, p0, Lpn/f$a;->g:Ljava/util/Set;

    return-object p0
.end method

.method public static bridge synthetic d(Lpn/f$a;)Lpn/a;
    .locals 0

    iget-object p0, p0, Lpn/f$a;->i:Lpn/a;

    return-object p0
.end method

.method public static bridge synthetic e(Lpn/f$a;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lpn/f$a;->b:Ljava/util/List;

    return-object p0
.end method

.method public static bridge synthetic f(Lpn/f$a;)Ljava/util/Set;
    .locals 0

    iget-object p0, p0, Lpn/f$a;->f:Ljava/util/Set;

    return-object p0
.end method

.method public static bridge synthetic g(Lpn/f$a;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lpn/f$a;->d:Ljava/util/List;

    return-object p0
.end method

.method public static bridge synthetic h(Lpn/f$a;)I
    .locals 0

    iget p0, p0, Lpn/f$a;->j:I

    return p0
.end method

.method public static bridge synthetic i(Lpn/f$a;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lpn/f$a;->e:Ljava/util/List;

    return-object p0
.end method

.method public static bridge synthetic j(Lpn/f$a;)Lpn/d;
    .locals 0

    invoke-virtual {p0}, Lpn/f$a;->l()Lpn/d;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public k()Lpn/f;
    .locals 2

    new-instance v0, Lpn/f;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lpn/f;-><init>(Lpn/f$a;Lpn/g;)V

    return-object v0
.end method

.method public final l()Lpn/d;
    .locals 1

    iget-object v0, p0, Lpn/f$a;->h:Lpn/d;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Lpn/e;

    invoke-direct {v0}, Lpn/e;-><init>()V

    return-object v0
.end method
