.class public final synthetic Lfp/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lfp/e0;


# direct methods
.method public synthetic constructor <init>(Lfp/e0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfp/j;->a:Lfp/e0;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lfp/j;->a:Lfp/e0;

    check-cast p1, Lcom/withpersona/sdk2/inquiry/internal/InquiryState;

    invoke-static {v0, p1}, Lfp/e0;->x(Lfp/e0;Lcom/withpersona/sdk2/inquiry/internal/InquiryState;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
