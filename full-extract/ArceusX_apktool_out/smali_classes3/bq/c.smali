.class public final Lbq/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lbq/a$b;


# instance fields
.field public final a:Lbq/b;


# direct methods
.method public constructor <init>(Lbq/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbq/c;->a:Lbq/b;

    return-void
.end method

.method public static b(Lbq/b;)Ldt/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbq/b;",
            ")",
            "Ldt/i<",
            "Lbq/a$b;",
            ">;"
        }
    .end annotation

    new-instance v0, Lbq/c;

    invoke-direct {v0, p0}, Lbq/c;-><init>(Lbq/b;)V

    invoke-static {v0}, Ldt/e;->a(Ljava/lang/Object;)Ldt/d;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Long;)Lbq/a;
    .locals 6
    .param p4    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p5    # Ljava/lang/Long;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/withpersona/sdk2/inquiry/selfie/pose/PoseInfo;",
            ">;",
            "Ljava/lang/Long;",
            ")",
            "Lbq/a;"
        }
    .end annotation

    iget-object v0, p0, Lbq/c;->a:Lbq/b;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-virtual/range {v0 .. v5}, Lbq/b;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Long;)Lbq/a;

    move-result-object p1

    return-object p1
.end method
