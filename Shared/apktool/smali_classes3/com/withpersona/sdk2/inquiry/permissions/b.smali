.class public final Lcom/withpersona/sdk2/inquiry/permissions/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/withpersona/sdk2/inquiry/permissions/a$a;


# instance fields
.field public final a:Lpp/j;


# direct methods
.method public constructor <init>(Lpp/j;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/permissions/b;->a:Lpp/j;

    return-void
.end method

.method public static b(Lpp/j;)Ldt/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpp/j;",
            ")",
            "Ldt/i<",
            "Lcom/withpersona/sdk2/inquiry/permissions/a$a;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/withpersona/sdk2/inquiry/permissions/b;

    invoke-direct {v0, p0}, Lcom/withpersona/sdk2/inquiry/permissions/b;-><init>(Lpp/j;)V

    invoke-static {v0}, Ldt/e;->a(Ljava/lang/Object;)Ldt/d;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a()Lcom/withpersona/sdk2/inquiry/permissions/a;
    .locals 1

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/permissions/b;->a:Lpp/j;

    invoke-virtual {v0}, Lpp/j;->b()Lcom/withpersona/sdk2/inquiry/permissions/a;

    move-result-object v0

    return-object v0
.end method
