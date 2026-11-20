.class public final Lfp/g0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lfp/e0$b;


# instance fields
.field public final a:Lfp/f0;


# direct methods
.method public constructor <init>(Lfp/f0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfp/g0;->a:Lfp/f0;

    return-void
.end method

.method public static b(Lfp/f0;)Ldt/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfp/f0;",
            ")",
            "Ldt/i<",
            "Lfp/e0$b;",
            ">;"
        }
    .end annotation

    new-instance v0, Lfp/g0;

    invoke-direct {v0, p0}, Lfp/g0;-><init>(Lfp/f0;)V

    invoke-static {v0}, Ldt/e;->a(Ljava/lang/Object;)Ldt/d;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Props;Landroidx/lifecycle/l0;)Lfp/e0;
    .locals 1

    iget-object v0, p0, Lfp/g0;->a:Lfp/f0;

    invoke-virtual {v0, p1, p2}, Lfp/f0;->b(Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Props;Landroidx/lifecycle/l0;)Lfp/e0;

    move-result-object p1

    return-object p1
.end method
