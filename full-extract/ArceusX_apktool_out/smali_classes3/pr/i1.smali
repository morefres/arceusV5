.class public final Lpr/i1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lpr/g1$e;


# instance fields
.field public final a:Lpr/h1;


# direct methods
.method public constructor <init>(Lpr/h1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpr/i1;->a:Lpr/h1;

    return-void
.end method

.method public static b(Lpr/h1;)Ldt/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpr/h1;",
            ")",
            "Ldt/i<",
            "Lpr/g1$e;",
            ">;"
        }
    .end annotation

    new-instance v0, Lpr/i1;

    invoke-direct {v0, p0}, Lpr/i1;-><init>(Lpr/h1;)V

    invoke-static {v0}, Ldt/e;->a(Ljava/lang/Object;)Ldt/d;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Input;Landroidx/lifecycle/l0;)Lpr/g1;
    .locals 1

    iget-object v0, p0, Lpr/i1;->a:Lpr/h1;

    invoke-virtual {v0, p1, p2}, Lpr/h1;->b(Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Input;Landroidx/lifecycle/l0;)Lpr/g1;

    move-result-object p1

    return-object p1
.end method
