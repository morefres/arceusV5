.class public final synthetic Lfp/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lfp/e0;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;


# direct methods
.method public synthetic constructor <init>(Lfp/e0;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfp/p;->a:Lfp/e0;

    iput-object p2, p0, Lfp/p;->b:Ljava/lang/String;

    iput-object p3, p0, Lfp/p;->c:Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lfp/p;->a:Lfp/e0;

    iget-object v1, p0, Lfp/p;->b:Ljava/lang/String;

    iget-object v2, p0, Lfp/p;->c:Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;

    check-cast p1, Lcom/withpersona/sdk2/inquiry/internal/network/i;

    invoke-static {v0, v1, v2, p1}, Lfp/e0;->A(Lfp/e0;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;Lcom/withpersona/sdk2/inquiry/internal/network/i;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
