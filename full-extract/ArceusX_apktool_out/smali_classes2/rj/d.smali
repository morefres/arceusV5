.class public Lrj/d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Lrj/c;

.field public b:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lrj/c;)V
    .locals 1

    .line 4
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    invoke-direct {p0, p1, v0}, Lrj/d;-><init>(Lrj/c;Ljava/util/HashMap;)V

    return-void
.end method

.method public constructor <init>(Lrj/c;Ljava/util/HashMap;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lrj/c;",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lrj/d;->a:Lrj/c;

    .line 3
    iput-object p2, p0, Lrj/d;->b:Ljava/util/HashMap;

    return-void
.end method


# virtual methods
.method public a()Lrj/c;
    .locals 1

    iget-object v0, p0, Lrj/d;->a:Lrj/c;

    return-object v0
.end method

.method public b()Ljava/util/HashMap;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lrj/d;->b:Ljava/util/HashMap;

    return-object v0
.end method
