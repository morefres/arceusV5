.class public final Lmo/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmo/a$b;


# instance fields
.field public final a:Lmo/b;


# direct methods
.method public constructor <init>(Lmo/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmo/c;->a:Lmo/b;

    return-void
.end method

.method public static b(Lmo/b;)Ldt/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lmo/b;",
            ")",
            "Ldt/i<",
            "Lmo/a$b;",
            ">;"
        }
    .end annotation

    new-instance v0, Lmo/c;

    invoke-direct {v0, p0}, Lmo/c;-><init>(Lmo/b;)V

    invoke-static {v0}, Ldt/e;->a(Ljava/lang/Object;)Ldt/d;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;)Lmo/a;
    .locals 1

    iget-object v0, p0, Lmo/c;->a:Lmo/b;

    invoke-virtual {v0, p1}, Lmo/b;->b(Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;)Lmo/a;

    move-result-object p1

    return-object p1
.end method
