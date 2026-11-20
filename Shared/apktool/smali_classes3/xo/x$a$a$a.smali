.class public final Lxo/x$a$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmu/i;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lxo/x$a$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lmu/i;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final synthetic a:Lxo/x;


# direct methods
.method public constructor <init>(Lxo/x;)V
    .locals 0

    iput-object p1, p0, Lxo/x$a$a$a;->a:Lxo/x;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Lcom/withpersona/sdk2/inquiry/InquiryActivityEvent;Lmt/b;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/withpersona/sdk2/inquiry/InquiryActivityEvent;",
            "Lmt/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of p2, p1, Lcom/withpersona/sdk2/inquiry/InquiryActivityEvent$CancelInquiry;

    if-eqz p2, :cond_0

    iget-object p2, p0, Lxo/x$a$a$a;->a:Lxo/x;

    check-cast p1, Lcom/withpersona/sdk2/inquiry/InquiryActivityEvent$CancelInquiry;

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/InquiryActivityEvent$CancelInquiry;->getSkipBackendCall()Z

    move-result p1

    const/4 v0, 0x1

    invoke-virtual {p2, v0, p1}, Lxo/x;->e(ZZ)V

    :cond_0
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lmt/b;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/withpersona/sdk2/inquiry/InquiryActivityEvent;

    invoke-virtual {p0, p1, p2}, Lxo/x$a$a$a;->b(Lcom/withpersona/sdk2/inquiry/InquiryActivityEvent;Lmt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
